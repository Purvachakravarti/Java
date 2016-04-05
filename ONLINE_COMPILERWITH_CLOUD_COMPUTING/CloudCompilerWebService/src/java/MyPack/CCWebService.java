/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPack;

import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Vector;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author OorjaTech
 */
@WebService(serviceName = "CCWebService")
public class CCWebService {
Database userdb = new Database();
    /**
     * Web service operation
     */
    @WebMethod(operationName = "Login")
    public SingleUser Login(@WebParam(name = "uid")
    String uid, @WebParam(name = "pass")
    String pass) {
        SingleUser ret = new SingleUser();
        //System.out.println("Login Called!");
        readFromFile();
        for(SingleUser u : userdb.allUsers){
            if(u.userID.equals(uid)){
                if(u.password.equals(pass)){
                    ret = u;
                    break;
                }
            }
        }
        return ret;
    }

    void readFromFile(){
        try{
            ObjectInputStream oi = new ObjectInputStream(new FileInputStream("c:\\projectData\\5040DB\\db.dat"));
            userdb = (Database)oi.readObject();
            oi.close();
        }catch(Exception e){
            System.out.println("Error Reading File : " + e);
        }
    }
    
    void WriteToFile(){
        try{
            ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("c:\\projectData\\5040DB\\db.dat"));
            oo.writeObject(userdb);
            oo.close();
        }catch(Exception e){
            System.out.println("Error Writing File : " + e);
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "chechUID")
    public Boolean chechUID(@WebParam(name = "uid")
    String uid) {
        boolean ret = false;
        readFromFile();
        for(SingleUser u : userdb.allUsers){
            if(u.userID.equals(uid)){
                return true;
            }
        }
        return false;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addUser")
    public String addUser(@WebParam(name = "user")
    SingleUser user) {
        String ret = "";
        readFromFile();
        userdb.allUsers.addElement(user);
        WriteToFile();
        return ret;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "UpdateUser")
    public String UpdateUser(@WebParam(name = "user")
    SingleUser user) {
        readFromFile();
        int index = -1;
        for(int i=0;i<userdb.allUsers.size();i++){
            if(userdb.allUsers.elementAt(i).userID.equals(user.userID)){
                index = i;
                break;
            }
        }
        if(index != -1){
            userdb.allUsers.removeElementAt(index);
            userdb.allUsers.insertElementAt(user, index);
            WriteToFile();
        }
        return "Successful!";
    }
    int getNextMessageID(){
        int max = 0;
        readFromFile();
        for(int i = 0;i<userdb.messageList.size();i++){
            if(userdb.messageList.elementAt(i).mid > max){
                max = userdb.messageList.elementAt(i).mid;
            }
        }
        max++;
        return max;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "removeMessage")
    public String removeMessage(@WebParam(name = "mid")
    int mid) {
        readFromFile();
        int index = -1;
        for(int i = 0;i<userdb.messageList.size();i++){
            if(userdb.messageList.elementAt(i).mid == mid){
                index = i;
                break;
            }
        }
        if(index != -1){
            userdb.messageList.removeElementAt(index);
            WriteToFile();
        }
        return "";
    }
    
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "AddMessage")
    public String AddMessage(@WebParam(name = "mes")
    SingleMessage mes) {
        readFromFile();
        boolean flag = false;
        for(SingleUser u : userdb.allUsers){
            if(u.userID.equals(mes.msgTo)){
                flag = true;
                break;
            }
        }
        if(flag){
            mes.mid = getNextMessageID();
            mes.dateTime = Calendar.getInstance();
            userdb.messageList.addElement(mes);
            WriteToFile();
            return "";
        }
        return "Unknown Recipiant!";
        
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "GetMyMessages")
    public Vector<SingleMessage> GetMyMessages(@WebParam(name = "uid")
    String uid) {
        Vector<SingleMessage> retVector = new Vector<SingleMessage>();
        readFromFile();
        for(SingleMessage m : userdb.messageList){
            if(m.msgTo.equals(uid)){
                retVector.addElement(m);
            }
        }
        return retVector;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "FetchTaskList")
    public Vector<SingleTask> FetchTaskList() {
        //TODO write your implementation code here:
        Vector<SingleTask> taskList = new Vector<SingleTask>();
        readFromFile();
        for(SingleTask s : userdb.taskList){
            taskList.addElement(s);
        }
        return taskList;
    }
    
        // compiler directory  must end with \\
    String compileJava(String code, String mainClass, String javaCompilerDirectory, String codeDirectory, String userID) {
        String result = "";

        // flush old directory
        clearDirectory(codeDirectory + "\\" + userID);
        // re-create directory...
        createDirectory(codeDirectory + "\\" + userID);

        try {
            // write java code
            String fname = codeDirectory + "\\" + userID + "\\" + mainClass + ".java";
            BufferedWriter bw = new BufferedWriter(new FileWriter(fname));
            bw.write(code);
            bw.close();

            // compile
            File codeFile = new File(fname);
            String parentDir = codeFile.getParent();

            ArrayList <String> cmd = new ArrayList <String> ();
            cmd.add(javaCompilerDirectory + "javac.exe");
            cmd.add("-classpath");
            cmd.add(parentDir);
            cmd.add("-sourcepath");
            cmd.add(parentDir);
            cmd.add("-d");
            cmd.add(parentDir);
            cmd.add("-verbose");
            cmd.add(fname);

            long t1 = Calendar.getInstance().getTimeInMillis();

            ProcessBuilder pb = new ProcessBuilder(cmd);
            Process p = pb.start();
            String res = "";
            int temp;
            BufferedInputStream in2 = new BufferedInputStream(p.getErrorStream());
            while( (temp=in2.read()) != -1) {
                res += (char)temp;
            }

            long t2 = Calendar.getInstance().getTimeInMillis();
            System.out.println("Time: " + (t2 - t1));
            result = res;
            
        }catch(Exception e) {
            result = "Exception Compiling: " + e;
        }
        return result;
    }
    
    // compiler directory string must end with \\
    String executeJava(String code, String mainClass, String javaCompilerDirectory, String codeDirectory, String userID) {
        String result = "";
        
        // flush old directory
        clearDirectory(codeDirectory + "\\" + userID);
        // re-create directory...
        createDirectory(codeDirectory + "\\" + userID);

        try {
            String fname = codeDirectory + "\\" + userID + "\\" + mainClass + ".java";
            BufferedWriter bw = new BufferedWriter(new FileWriter(fname));
            bw.write(code);
            bw.close();

            // compile
            File codeFile = new File(fname);
            String parentDir = codeFile.getParent();
            ArrayList <String> cmd = new ArrayList <String> ();
            cmd.add(javaCompilerDirectory + "javac.exe");
            cmd.add("-classpath");
            cmd.add(parentDir);
            cmd.add("-sourcepath");
            cmd.add(parentDir);
            cmd.add("-d");
            cmd.add(parentDir);
            cmd.add("-verbose");
            cmd.add(fname);

            ProcessBuilder pb = new ProcessBuilder(cmd);
            Process p = pb.start();
            String res = "";
            int temp;
            BufferedInputStream in2 = new BufferedInputStream(p.getErrorStream());
            while( (temp=in2.read()) != -1) {
                res += (char)temp;
            }

            // execute code begins...
            fname = codeDirectory + "\\" + userID + "\\" + mainClass + ".java";
            codeFile = new File(fname);
            parentDir = codeFile.getParent();
            
            String className = mainClass;

            cmd = new ArrayList<String> ();
            cmd.add("java");
            cmd.add("-classpath");
            cmd.add(parentDir);
            cmd.add("-Djava.library.path="+parentDir);
            cmd.add(className);

            long t1 = Calendar.getInstance().getTimeInMillis();
            pb = new ProcessBuilder(cmd);
            p = pb.start();
            res = "Program Standard Error Stream:\n";
            in2 = new BufferedInputStream(p.getErrorStream());
            while( (temp=in2.read()) != -1) {
                res += (char)temp;
            }
            res += "\n\nProgram Standard Output Stream:\n";
            in2 = new BufferedInputStream(p.getInputStream());
            while( (temp=in2.read()) != -1) {
                res += (char)temp;
            }
            long t2 = Calendar.getInstance().getTimeInMillis();
            System.out.println("Time: " + (t2-t1));
            result = res;
        }catch(Exception e) {
            result = "Exception: " + e;
        }
        return result;
    }
    
    void createDirectory(String directory) {
        File f = new File(directory);
        try {
            f.mkdir();
        }catch(Exception e) {
            ;
        }
    }    
    
    void clearDirectory(String directory) {
        File f = new File(directory);
        if(!f.exists()) {
            return;
        }
        // delete all internal files
        try {
            File files[] = f.listFiles();
            for(File file: files) {
                try {
                    file.delete();
                }catch(Exception e) {
                    System.out.println("Error Deleting File: " + e);
                }
            }
        }catch(Exception e) {
            ;
        }
        
        try {
            f.delete();
        }catch(Exception e) {
            ;
        }        
    } 
    
    String compileC(String code, String mainClass, String csCompilerDirectory, String codeDirectory, String userID) {
        String result = "";
       // flush old directory
        clearDirectory(codeDirectory + "\\" + userID);
        // re-create directory...
        createDirectory(codeDirectory + "\\" + userID);


        String fname = codeDirectory + "\\" + userID + "\\" + mainClass + ".cpp";
        try {
            new File(fname).delete();
        }catch(Exception e) { ; }
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fname));
            bw.write(code);
            bw.close();
            
            File codeFile = new File(fname);
            String parentDir = codeFile.getParent();
            String exeName = fname;
            while(!exeName.endsWith(".")) { // wait till dot
                exeName = exeName.substring(0,exeName.length()-1);
            }
            exeName += "exe";

            ArrayList <String> cmd = new ArrayList <String> ();
            cmd.add(csCompilerDirectory + "cl.exe");
            cmd.add("/I");
            cmd.add(parentDir);
            cmd.add("\"" + fname + "\"");
            cmd.add("/Fe\"" + exeName + "\"");

            long t1 = Calendar.getInstance().getTimeInMillis();
            ProcessBuilder pb = new ProcessBuilder(cmd);
            pb.directory(new File(parentDir));
            Process p = pb.start();

            String res = "";
            int temp;
            BufferedInputStream in2 = new BufferedInputStream(p.getErrorStream());
            while( (temp=in2.read()) != -1) {
                res += (char)temp;
            }
            res += "\n";
            in2 = new BufferedInputStream(p.getInputStream());
            while( (temp=in2.read()) != -1) {
                res += (char)temp;
            }
            long t2 = Calendar.getInstance().getTimeInMillis();
            System.out.println("Time: " + (t2 - t1));
            result = res;
        }catch(Exception e) {
            result = "Exception Compiling: " + e;
        }

        return result;
    }
    
    String executeC(String code, String mainClass, String csCompilerDirectory, String codeDirectory, String userID) {
        String result = "";
       // flush old directory
        //clearDirectory(codeDirectory + "\\" + userID);
        // re-create directory...
        //createDirectory(codeDirectory + "\\" + userID);

        try {
            String fname = codeDirectory + "\\" + userID + "\\" + mainClass + ".cpp";
            File codeFile = new File(fname);
            String fileName = codeFile.getName();
            String parentDir = codeFile.getParent();
            String exeName = fname;
            while(!exeName.endsWith(".")) { // wait till dot
                exeName = exeName.substring(0,exeName.length()-1);
            }
            exeName += "exe";

            long t1 = Calendar.getInstance().getTimeInMillis();
            ProcessBuilder pb = new ProcessBuilder(exeName);
            pb.directory(new File(parentDir));
            Process p = pb.start();

            String res = "Program Standard Error Stream:\n";
            int temp;
            BufferedInputStream in2 = new BufferedInputStream(p.getErrorStream());
            while( (temp=in2.read()) != -1) {
                res += (char)temp;
            }
            res += "\n\nProgram Standard Output Stream:\n";
            in2 = new BufferedInputStream(p.getInputStream());
            while( (temp=in2.read()) != -1) {
                res += (char)temp;
            }
            long t2 = Calendar.getInstance().getTimeInMillis();
            System.out.println("Time: " + (t2 - t1));
            result = res;
        }catch(Exception e) {
            result = "Exception Compiling: " + e;
        }
        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "compileCode")
    public byte[] compileCode(@WebParam(name = "code") SingleCode code, @WebParam(name = "uid") String uid) {
        //TODO write your implementation code here:
        String op = "";
        String compilerDir = "";
        if(code.language == 2){
            op = compileJava(code.code, code.mainClassName, compilerDir, "C:\\ProjectData\\5040DB\\CTemp", uid);
            SingleLog l = new SingleLog();
            l.dt = Calendar.getInstance();
            l.uid = uid;
            l.activity = "CODE COMPILE : " + code.codename + "  LANGUAGE : JAVA";
            l.ip = "";
            readFromFile();
            userdb.logList.addElement(l);
            WriteToFile();
            
        }else{
            op = compileC(code.code, code.mainClassName, compilerDir, "C:\\ProjectData\\5040DB\\CTemp", uid);
            SingleLog l = new SingleLog();
            l.dt = Calendar.getInstance();
            l.uid = uid;
            if(code.language == 0)
                l.activity = "CODE COMPILE : " + code.codename + "  LANGUAGE : C";
            else
                l.activity = "CODE COMPILE : " + code.codename + "  LANGUAGE : CPP";
            l.ip = "";
            readFromFile();
            userdb.logList.addElement(l);
            WriteToFile();
        }
        
        System.out.println("OUTPUT : " + op);
        return op.getBytes();
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "executeCode")
    public byte[] executeCode(@WebParam(name = "code") SingleCode code, @WebParam(name = "uid") String uid) {
        //TODO write your implementation code here:
        String op = "";
        String compilerDir = "";
        if(code.language == 2){
            op = executeJava(code.code, code.mainClassName, compilerDir, "C:\\ProjectData\\5040DB\\CTemp", uid);
            SingleLog l = new SingleLog();
            l.dt = Calendar.getInstance();
            l.uid = uid;
            l.activity = "CODE EXECUTE : " + code.codename + "  LANGUAGE : JAVA";
            l.ip = "";
            readFromFile();
            userdb.logList.addElement(l);
            WriteToFile();
        }else{
            op = executeC(code.code, code.mainClassName, compilerDir, "C:\\ProjectData\\5040DB\\CTemp", uid);
            SingleLog l = new SingleLog();
            l.dt = Calendar.getInstance();
            l.uid = uid;
            if(code.language == 0)
                l.activity = "CODE EXECUTE : " + code.codename + "  LANGUAGE : C";
            else
                l.activity = "CODE EXECUTE : " + code.codename + "  LANGUAGE : CPP";
            l.ip = "";
            readFromFile();
            userdb.logList.addElement(l);
            WriteToFile();
        }
        return op.getBytes();
    }
}
