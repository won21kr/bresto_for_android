package jp.crudefox.ricoh.bresto.chikara.manager;

public class CFConst {




	//private static String LOGIN_URL = "http://****/login.php";

	//http://172.21.31.199/bbs/login.php
	//public static final String SERVER = "http://172.21.31.199/";
	//public static final String SERVER = "http://180.0.56.207:15060/";
	//public static final String SERVER = "http://192.168.1.5:8080/";
	//public static final String SERVER = "http://192.168.1.6:8080/";
	//public static final String SERVER = "http://192.168.1.107:8080/";
	//public static final String SERVER = "http://202.250.66.29/";

	//public static final String DOMAIN = "192.168.1.117";

	public static final String DOMAIN = "bresto.cloudapp.net";
	public static final String SERVER = "http://"+DOMAIN+":80/";
	public static final String SERVER_WS = "ws://"+DOMAIN+":80/";



//	public static final String LOGIN = "HeallinServer0/Login";
//	public static final String CREATE_ACCOUNT = "HeallinServer0/CreateAccount";
//	public static final String BOARD = "HeallinServer0/Board";
//	public static final String CONTRIBUTE = "HeallinServer0/Contribute";
//	public static final String DEL_CONTRIBUTE = "HeallinServer0/DeleteContribute";


	public static final String ROOTDIR = "BreStoServer0/";
	public static final String LOGIN = ROOTDIR + "api/login";
	public static final String PROJECT_LIST = ROOTDIR + "api/project_list";
	public static final String SELECT_PROJECT = ROOTDIR + "api/select_project";
	public static final String SOCKET_NODE_EDGE = ROOTDIR + "api/socket_node_edge";


	public static final String CREATE_ACCOUNT = ROOTDIR + "create_user";

	public static final String SUGGEST_KEYWORDS = ROOTDIR + "SuggestKeywords";
	public static final String KEYWORDS = ROOTDIR + "Keywords";
	public static final String CONNECT_KEYWORD = ROOTDIR + "ConnectKeyword";
	public static final String KEYWORDS_RELATIONS = ROOTDIR + "KeywordsRelations";



}
