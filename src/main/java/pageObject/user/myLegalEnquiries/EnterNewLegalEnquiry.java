package pageObject.user.myLegalEnquiries;

public class EnterNewLegalEnquiry {

    public String LegalCategoryXpath;
    public String SubjectXpath;
    public String DescriptionXpath;
    public String LinkDocXpath;
    public String SelectFileInputXpath;
    public String SubmitXpath;


    public EnterNewLegalEnquiry(
            String LegalCategory,
            String Subject,
            String Description,
            String LinkDoc,
            String SelectFileInput,
            String Submit
            ) {
        LegalCategoryXpath = LegalCategory;
        SubjectXpath = Subject;
        DescriptionXpath = Description;
        LinkDocXpath = LinkDoc;
        SelectFileInputXpath = SelectFileInput;
        SubmitXpath = Submit;
    }


}
