
package MyPack;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the MyPack package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LoginResponse_QNAME = new QName("http://MyPack/", "LoginResponse");
    private final static QName _UpdateUser_QNAME = new QName("http://MyPack/", "UpdateUser");
    private final static QName _GetMyMessagesResponse_QNAME = new QName("http://MyPack/", "GetMyMessagesResponse");
    private final static QName _RemoveMessage_QNAME = new QName("http://MyPack/", "removeMessage");
    private final static QName _FetchTaskList_QNAME = new QName("http://MyPack/", "FetchTaskList");
    private final static QName _FetchTaskListResponse_QNAME = new QName("http://MyPack/", "FetchTaskListResponse");
    private final static QName _ExecuteCodeResponse_QNAME = new QName("http://MyPack/", "executeCodeResponse");
    private final static QName _ChechUID_QNAME = new QName("http://MyPack/", "chechUID");
    private final static QName _ExecuteCode_QNAME = new QName("http://MyPack/", "executeCode");
    private final static QName _UpdateUserResponse_QNAME = new QName("http://MyPack/", "UpdateUserResponse");
    private final static QName _AddMessage_QNAME = new QName("http://MyPack/", "AddMessage");
    private final static QName _CompileCode_QNAME = new QName("http://MyPack/", "compileCode");
    private final static QName _AddUser_QNAME = new QName("http://MyPack/", "addUser");
    private final static QName _RemoveMessageResponse_QNAME = new QName("http://MyPack/", "removeMessageResponse");
    private final static QName _ChechUIDResponse_QNAME = new QName("http://MyPack/", "chechUIDResponse");
    private final static QName _GetMyMessages_QNAME = new QName("http://MyPack/", "GetMyMessages");
    private final static QName _AddUserResponse_QNAME = new QName("http://MyPack/", "addUserResponse");
    private final static QName _CompileCodeResponse_QNAME = new QName("http://MyPack/", "compileCodeResponse");
    private final static QName _AddMessageResponse_QNAME = new QName("http://MyPack/", "AddMessageResponse");
    private final static QName _Login_QNAME = new QName("http://MyPack/", "Login");
    private final static QName _ExecuteCodeResponseReturn_QNAME = new QName("", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: MyPack
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RemoveMessageResponse }
     * 
     */
    public RemoveMessageResponse createRemoveMessageResponse() {
        return new RemoveMessageResponse();
    }

    /**
     * Create an instance of {@link ChechUID }
     * 
     */
    public ChechUID createChechUID() {
        return new ChechUID();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link GetMyMessagesResponse }
     * 
     */
    public GetMyMessagesResponse createGetMyMessagesResponse() {
        return new GetMyMessagesResponse();
    }

    /**
     * Create an instance of {@link UpdateUser }
     * 
     */
    public UpdateUser createUpdateUser() {
        return new UpdateUser();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link AddMessage }
     * 
     */
    public AddMessage createAddMessage() {
        return new AddMessage();
    }

    /**
     * Create an instance of {@link ChechUIDResponse }
     * 
     */
    public ChechUIDResponse createChechUIDResponse() {
        return new ChechUIDResponse();
    }

    /**
     * Create an instance of {@link CompileCodeResponse }
     * 
     */
    public CompileCodeResponse createCompileCodeResponse() {
        return new CompileCodeResponse();
    }

    /**
     * Create an instance of {@link SingleMessage }
     * 
     */
    public SingleMessage createSingleMessage() {
        return new SingleMessage();
    }

    /**
     * Create an instance of {@link SingleUser }
     * 
     */
    public SingleUser createSingleUser() {
        return new SingleUser();
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link FetchTaskList }
     * 
     */
    public FetchTaskList createFetchTaskList() {
        return new FetchTaskList();
    }

    /**
     * Create an instance of {@link CompileCode }
     * 
     */
    public CompileCode createCompileCode() {
        return new CompileCode();
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     * 
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link SingleTask }
     * 
     */
    public SingleTask createSingleTask() {
        return new SingleTask();
    }

    /**
     * Create an instance of {@link ExecuteCodeResponse }
     * 
     */
    public ExecuteCodeResponse createExecuteCodeResponse() {
        return new ExecuteCodeResponse();
    }

    /**
     * Create an instance of {@link ExecuteCode }
     * 
     */
    public ExecuteCode createExecuteCode() {
        return new ExecuteCode();
    }

    /**
     * Create an instance of {@link SingleCode }
     * 
     */
    public SingleCode createSingleCode() {
        return new SingleCode();
    }

    /**
     * Create an instance of {@link AddMessageResponse }
     * 
     */
    public AddMessageResponse createAddMessageResponse() {
        return new AddMessageResponse();
    }

    /**
     * Create an instance of {@link FetchTaskListResponse }
     * 
     */
    public FetchTaskListResponse createFetchTaskListResponse() {
        return new FetchTaskListResponse();
    }

    /**
     * Create an instance of {@link RemoveMessage }
     * 
     */
    public RemoveMessage createRemoveMessage() {
        return new RemoveMessage();
    }

    /**
     * Create an instance of {@link GetMyMessages }
     * 
     */
    public GetMyMessages createGetMyMessages() {
        return new GetMyMessages();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyPack/", name = "LoginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyPack/", name = "UpdateUser")
    public JAXBElement<UpdateUser> createUpdateUser(UpdateUser value) {
        return new JAXBElement<UpdateUser>(_UpdateUser_QNAME, UpdateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMyMessagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyPack/", name = "GetMyMessagesResponse")
    public JAXBElement<GetMyMessagesResponse> createGetMyMessagesResponse(GetMyMessagesResponse value) {
        return new JAXBElement<GetMyMessagesResponse>(_GetMyMessagesResponse_QNAME, GetMyMessagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyPack/", name = "removeMessage")
    public JAXBElement<RemoveMessage> createRemoveMessage(RemoveMessage value) {
        return new JAXBElement<RemoveMessage>(_RemoveMessage_QNAME, RemoveMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchTaskList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyPack/", name = "FetchTaskList")
    public JAXBElement<FetchTaskList> createFetchTaskList(FetchTaskList value) {
        return new JAXBElement<FetchTaskList>(_FetchTaskList_QNAME, FetchTaskList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchTaskListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyPack/", name = "FetchTaskListResponse")
    public JAXBElement<FetchTaskListResponse> createFetchTaskListResponse(FetchTaskListResponse value) {
        return new JAXBElement<FetchTaskListResponse>(_FetchTaskListResponse_QNAME, FetchTaskListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyPack/", name = "executeCodeResponse")
    public JAXBElement<ExecuteCodeResponse> createExecuteCodeResponse(ExecuteCodeResponse value) {
        return new JAXBElement<ExecuteCodeResponse>(_ExecuteCodeResponse_QNAME, ExecuteCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChechUID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyPack/", name = "chechUID")
    public JAXBElement<ChechUID> createChechUID(ChechUID value) {
        return new JAXBElement<ChechUID>(_ChechUID_QNAME, ChechUID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyPack/", name = "executeCode")
    public JAXBElement<ExecuteCode> createExecuteCode(ExecuteCode value) {
        return new JAXBElement<ExecuteCode>(_ExecuteCode_QNAME, ExecuteCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyPack/", name = "UpdateUserResponse")
    public JAXBElement<UpdateUserResponse> createUpdateUserResponse(UpdateUserResponse value) {
        return new JAXBElement<UpdateUserResponse>(_UpdateUserResponse_QNAME, UpdateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyPack/", name = "AddMessage")
    public JAXBElement<AddMessage> createAddMessage(AddMessage value) {
        return new JAXBElement<AddMessage>(_AddMessage_QNAME, AddMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompileCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyPack/", name = "compileCode")
    public JAXBElement<CompileCode> createCompileCode(CompileCode value) {
        return new JAXBElement<CompileCode>(_CompileCode_QNAME, CompileCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyPack/", name = "addUser")
    public JAXBElement<AddUser> createAddUser(AddUser value) {
        return new JAXBElement<AddUser>(_AddUser_QNAME, AddUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyPack/", name = "removeMessageResponse")
    public JAXBElement<RemoveMessageResponse> createRemoveMessageResponse(RemoveMessageResponse value) {
        return new JAXBElement<RemoveMessageResponse>(_RemoveMessageResponse_QNAME, RemoveMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChechUIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyPack/", name = "chechUIDResponse")
    public JAXBElement<ChechUIDResponse> createChechUIDResponse(ChechUIDResponse value) {
        return new JAXBElement<ChechUIDResponse>(_ChechUIDResponse_QNAME, ChechUIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMyMessages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyPack/", name = "GetMyMessages")
    public JAXBElement<GetMyMessages> createGetMyMessages(GetMyMessages value) {
        return new JAXBElement<GetMyMessages>(_GetMyMessages_QNAME, GetMyMessages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyPack/", name = "addUserResponse")
    public JAXBElement<AddUserResponse> createAddUserResponse(AddUserResponse value) {
        return new JAXBElement<AddUserResponse>(_AddUserResponse_QNAME, AddUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompileCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyPack/", name = "compileCodeResponse")
    public JAXBElement<CompileCodeResponse> createCompileCodeResponse(CompileCodeResponse value) {
        return new JAXBElement<CompileCodeResponse>(_CompileCodeResponse_QNAME, CompileCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyPack/", name = "AddMessageResponse")
    public JAXBElement<AddMessageResponse> createAddMessageResponse(AddMessageResponse value) {
        return new JAXBElement<AddMessageResponse>(_AddMessageResponse_QNAME, AddMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MyPack/", name = "Login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = ExecuteCodeResponse.class)
    public JAXBElement<byte[]> createExecuteCodeResponseReturn(byte[] value) {
        return new JAXBElement<byte[]>(_ExecuteCodeResponseReturn_QNAME, byte[].class, ExecuteCodeResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = CompileCodeResponse.class)
    public JAXBElement<byte[]> createCompileCodeResponseReturn(byte[] value) {
        return new JAXBElement<byte[]>(_ExecuteCodeResponseReturn_QNAME, byte[].class, CompileCodeResponse.class, ((byte[]) value));
    }

}
