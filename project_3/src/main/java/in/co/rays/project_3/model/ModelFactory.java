package in.co.rays.project_3.model;

import java.util.HashMap;

import java.util.ResourceBundle;

/**
 * ModelFactory decides which model implementation run
 * 
 * @author pooja jawariya
 *
 */
public final class ModelFactory {

	private static ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.project_3.bundle.system");
	private static final String DATABASE = rb.getString("DATABASE");
	private static ModelFactory mFactory = null;
	private static HashMap modelCache = new HashMap();//non forgotable memory

	private ModelFactory() {

	}

	public static ModelFactory getInstance() {
		if (mFactory == null) {
			mFactory = new ModelFactory();
		}
		return mFactory;
	}

	public BankModelInt getBankModel() {

		BankModelInt bankModel = (BankModelInt) modelCache.get("bankModel");
		if (bankModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				bankModel = new BankModelHibImp();
			}
			/*
			 * if ("JDBC".equals(DATABASE)) { bankModel = new UserModelJDBCImpl(); }
			 */
			modelCache.put("bankModel", bankModel);
		}

		return bankModel;
	}
	public OwnerModelInt getOwnerModel() {

		OwnerModelInt OwnerModel = (OwnerModelInt) modelCache.get("OwnerModel");
		if (OwnerModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				OwnerModel = new OwnerModelHibImp();
			}
			/*
			 * if ("JDBC".equals(DATABASE)) { bankModel = new UserModelJDBCImpl(); }
			 */
			modelCache.put("OwnerModel",OwnerModel);
		}

		return OwnerModel;
	}

	
	public ProductDetailsModelInt getProductDetailsModel() {

		ProductDetailsModelInt ProductDetailsModel = (ProductDetailsModelInt) modelCache.get("ProductDetailsModel");
		if (ProductDetailsModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				ProductDetailsModel = new ProductDetailsModelHibImp();
			}
			/*
			 * if ("JDBC".equals(DATABASE)) { bankModel = new UserModelJDBCImpl(); }
			 */
			modelCache.put("ProductDetailsModel",ProductDetailsModel);
		}

		return ProductDetailsModel;
	}



	public SalaryModelInt getSalaryModel() {

		SalaryModelInt SalaryModel = (SalaryModelInt) modelCache.get("SalaryModel");
		if (SalaryModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				SalaryModel =  new SalaryModelHibImp();
			}
			/*
			 * if ("JDBC".equals(DATABASE)) { bankModel = new UserModelJDBCImpl(); }
			 */
			modelCache.put("SalaryModel",SalaryModel);
		}

		return SalaryModel;
	}



	public MarksheetModelInt getMarksheetModel() {
		MarksheetModelInt marksheetModel = (MarksheetModelInt) modelCache.get("marksheetModel");
		if (marksheetModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				marksheetModel = new MarksheetModelHibImp();
			}
			if ("JDBC".equals(DATABASE)) {
				marksheetModel = new MarksheetModelJDBCImpl();
			}
			modelCache.put("marksheetModel", marksheetModel);
		}
		return marksheetModel;
	}

	public CollegeModelInt getCollegeModel() {
		CollegeModelInt collegeModel = (CollegeModelInt) modelCache.get("collegeModel");
		if (collegeModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				collegeModel = new CollegeModelHibImp();

			}
			if ("JDBC".equals(DATABASE)) {
				collegeModel = new CollegeModelJDBCImpl();
			}
			modelCache.put("collegeModel", collegeModel);
		}
		return collegeModel;
	}

	public RoleModelInt getRoleModel() {
		RoleModelInt roleModel = (RoleModelInt) modelCache.get("roleModel");
		if (roleModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				roleModel = new RoleModelHibImp();

			}
			if ("JDBC".equals(DATABASE)) {
				roleModel = new RoleModelJDBCImpl();
			}
			modelCache.put("roleModel", roleModel);
		}
		return roleModel;
	}

	public UserModelInt getUserModel() {

		UserModelInt userModel = (UserModelInt) modelCache.get("userModel");
		if (userModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				userModel = new UserModelHibImp();
			}
			if ("JDBC".equals(DATABASE)) {
				userModel = new UserModelJDBCImpl();
			}
			modelCache.put("userModel", userModel);
		}

		return userModel;
	}

	public StudentModelInt getStudentModel() {
		StudentModelInt studentModel = (StudentModelInt) modelCache.get("studentModel");
		if (studentModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				studentModel = new StudentModelHibImp();
			}
			if ("JDBC".equals(DATABASE)) {
				studentModel = new StudentModelJDBCImpl();
			}
			modelCache.put("studentModel", studentModel);
		}

		return studentModel;
	}

	public CourseModelInt getCourseModel() {
		CourseModelInt courseModel = (CourseModelInt) modelCache.get("courseModel");
		if (courseModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				courseModel = new CourseModelHibImp();
			}
			if ("JDBC".equals(DATABASE)) {
				courseModel = new CourseModelJDBCImpl();
			}
			modelCache.put("courseModel", courseModel);
		}

		return courseModel;
	}

	public TimetableModelInt getTimetableModel() {

		TimetableModelInt timetableModel = (TimetableModelInt) modelCache.get("timetableModel");

		if (timetableModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				timetableModel = new TimetableModelHibImp();
			}
			if ("JDBC".equals(DATABASE)) {
				timetableModel = new TimetableModelJDBCImpl();
			}
			modelCache.put("timetableModel", timetableModel);
		}

		return timetableModel;
	}

	public SubjectModelInt getSubjectModel() {
		SubjectModelInt subjectModel = (SubjectModelInt) modelCache.get("subjectModel");
		if (subjectModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				subjectModel = new SubjectModelHibImp();
			}
			if ("JDBC".equals(DATABASE)) {
				subjectModel = new SubjectModelJDBCImpl();
			}
			modelCache.put("subjectModel", subjectModel);
		}

		return subjectModel;
	}

	public FacultyModelInt getFacultyModel() {
		FacultyModelInt facultyModel = (FacultyModelInt) modelCache.get("facultyModel");
		if (facultyModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				facultyModel = new FacultyModelHibImp();
			}
			if ("JDBC".equals(DATABASE)) {
				facultyModel = new FacultyModelJDBCImpl();
			}
			modelCache.put("facultyModel", facultyModel);
		}

		return facultyModel;
	}

	public ClientModelInt getClientModel() {
		ClientModelInt ClientModel = (ClientModelInt) modelCache.get("Model");
		if (ClientModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				ClientModel = new ClientModelHibImp();
			}
			
			modelCache.put("ClientModel", ClientModel);
		}

		return ClientModel;

		
	}

	
	  public PoojaModelInt getPoojaModel() {
	  
	  
	  PoojaModelInt PoojaModel = (PoojaModelInt) modelCache.get("Model"); if
	  (PoojaModel == null) { if ("Hibernate".equals(DATABASE)) { PoojaModel = new
	  PoojaModelHibImp(); }
	  
	  modelCache.put("PoojaModel", PoojaModel); }
	  
	  return PoojaModel;
	  
	  
	  }

	public StaffMemberModelInt getStaffMemberModel() {
		StaffMemberModelInt StaffMemberModel = (StaffMemberModelInt) modelCache.get("Model");
		if (StaffMemberModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				StaffMemberModel = new StaffMemberModelHibImp();
			}
			
			modelCache.put("StaffMemberModel", StaffMemberModel);
		}

		return StaffMemberModel;


	}

	public CustomerModelInt getCustomerModel() {
		
		CustomerModelInt CustomerModel = (CustomerModelInt) modelCache.get("Model");
		if (CustomerModel == null) {
			if ("Hibernate".equals(DATABASE)) {
				CustomerModel = new CustomerModelHibImp();
			}
			
			modelCache.put("CustomerModel", CustomerModel);
		}

		return CustomerModel;



	 
	}

}
