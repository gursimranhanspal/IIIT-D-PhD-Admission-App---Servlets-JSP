package Global;

public class Global {
	// Prototype of the Database table
	public static final String SQL_tabledeclaration = "("
													+ "EMAIL varchar(100),"
													+ "NAME varchar(100),"
													+ "CORRESPONDENCE_ADDRESS varchar(250),"
													+ "MOBILE varchar(10),"
													+ "PHD_STREAM varchar(100),"
													+ "PHD_AREA_PREFERENCE_1 varchar(100),"
													+ "PHD_AREA_PREFERENCE_2 varchar(100),"
													+ "PHD_AREA_PREFERENCE_3 varchar(100),"
													+ "GENDER varchar(10),"
													+ "CATEGORY varchar(10),"
													+ "PHYSICALLY_DISABLED varchar(5),"
													+ "DATE_OF_BIRTH date,"
													+ "CW_DEFENCE varchar(5),"
													+ "FATHER_NAME varchar(100),"
													+ "NATIONALITY varchar(100),"
													+ "PERMANENT_ADDRESS varchar(250),"
													+ "PINCODE varchar(10),"
													+ ""
													+ "X_BOARD varchar(100),"
													+ "X_MARKS real,"				// REAL (precision = 7)
													+ "X_YEAR_OF_PASSING integer(10),"
													+ ""
													+ "XII_BOARD varchar(100),"
													+ "XII_MARKS real,"
													+ "XII_YEAR_OF_PASSING integer(10),"
													+ ""
													+ "GRAD_DEGREE varchar(100),"
													+ "GRAD_DEPARTMENT varchar(100),"
													+ "GRAD_COLLEGE varchar(100),"
													+ "GRAD_UNIVERSITY varchar(100),"
													+ "GRAD_CITY varchar(100),"
													+ "GRAD_STATE varchar(100),"
													+ "GRAD_YEAR_OF_PASSING integer(10),"
													+ "GRAD_SCORE_TYPE varchar(10)," + "GRAD_CGPA real," + "GRAD_MARKS real," + "GRAD_PERCENT real,"
													+ "APPLIED_ECE_PHD varchar(5),"
													+ "ECE_PHD_SUBJECT_PREFERENCE_1 varchar(100),"
													+ "ECE_PHD_SUBJECT_PREFERENCE_2 varchar(100),"
													+ "ECE_PHD_SUBJECT_PREFERENCE_3 varchar(100),"
													+ "ECE_PHD_SUBJECT_PREFERENCE_4 varchar(100),"
													+ ""
													+ "COMPLETED_POSTGRAD varchar(5),"
													+ "POSTGRAD_DEGREE varchar(100),"
													+ "POSTGRAD_DEPARTMENT varchar(100),"
													+ "POSTGRAD_COLLEGE varchar(100),"
													+ "POSTGRAD_THESIS varchar(100),"
													+ "POSTGRAD_CITY varchar(100),"
													+ "POSTGRAD_STATE varchar(100),"
													+ "POSTGRAD_YEAR_OF_PASSING integer(10),"
													+ "POSTGRAD_SCORE_TYPE varchar(10)," + "POSTGRAD_CGPA real," + "POSTGRAD_MARKS real," + "POSTGRAD_PERCENT real,"
													+ ""
													+ "OTHER_ACADEMIC_DEGREES varchar(250),"
													+ "OAD_EXAM_NAME varchar(100),"
													+ "OAD_SUBJECT varchar(100),"
													+ "OAD_YEAR_OF_PASSING integer(10),"
													+ "OAD_SCORE real,"
													+ "OAD_RANK integer(10),"
													+ ""
													+ "TAKEN_GATE varchar(5),"
													+ "GATE_AREA varchar(100),"
													+ "GATE_YEAR_OF_PASSING integer(10),"
													+ "GATE_MARKS real,"
													+ "GATE_SCORE integer(10),"
													+ "GATE_RANK integer(10),"
													+ ""
													+ "ACHIEVEMENTS varchar(250),"
													+ ""
													+ "TIMESTAMP timestamp,"
													+ "ENROLLMENT_NUMBER varchar(15),"
													+ ""
//													+ "UPLOADED_CV varchar(5),"
//													+ "UPLOADED_SOP varchar(5),"
													+ ""
													+ "PRIMARY KEY (ENROLLMENT_NUMBER)"
													+ ")";
	
	// Google API
	public static final String clientID = "135582840779-c5o9ca2bhsdma277vch1995md2ih3li2.apps.googleusercontent.com";
	public static final String clientSecret = "tJGc9vxXetsGALFz4c5m5RWL";
	public static final String redirectURL = "http://localhost:8080/PhD_Registration_Form_Servlet/Login";
	public static ClientInfo activeClient = null;
	
	// No need of a constructor
	private Global() {
	}
}
