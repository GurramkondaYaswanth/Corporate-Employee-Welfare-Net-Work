package Service;

public class CRUDoperations {
	public void functionality(int fxnNum, String email, String password) {   //if they want to view or post innovative thoughts
		if(fxnNum == 1) {
			InnovativeThoughts IT = new InnovativeThoughts();
			IT.IT(email , password);	
		}else if(fxnNum == 2) {
			CompanyEvents CE = new CompanyEvents();
			CE.photoshare(email,password);
		}else if(fxnNum == 3) {
			TechnicalDoubts TD = new TechnicalDoubts();
			TD.TD(email , password);
		}else if(fxnNum == 4) {
			WorkExperience WE = new WorkExperience();
			WE.WE(email , password);
		}else if(fxnNum == 5) {
			PersonalRelatingThings PRT = new PersonalRelatingThings();
			PRT.PRT(email, password);
		}else if(fxnNum == 6) {
			CompanyGrowth CG = new CompanyGrowth();
			CG.CG(email, password);
		}else if(fxnNum == 7) {
			JobVacancy JV = new JobVacancy();
			JV.JV(email, password);
		}else if(fxnNum == 8) {
			Matrimonial M = new Matrimonial();
			M.matrimonial(email, password);
		}else if(fxnNum == 9) {
			Birthdays BD = new Birthdays();
			BD.bdays(email, password);
		}else if(fxnNum == 10) {
			VacationPlansGetTogether VPGT = new VacationPlansGetTogether();
			VPGT.VPGT(email, password);
		}
	}
	

}
