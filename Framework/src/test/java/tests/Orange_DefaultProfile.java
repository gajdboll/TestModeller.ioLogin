package tests;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//https://herokuapp.cloud.testinsights.io/app/#!/model-engine/guid/99b96bac-919c-41d2-aef9-6a319132677a
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 86, profileId = 100081)
public class Orange_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Orange","Orange - Default Profile"})
    @TestModellerPath(guid = "a647e35b-5f81-4db5-be7d-1791ac2d6351")
    public void GoToUrlIentertxtUsername1inthetxtUsernameIentertxtPassword2inthetxtPasswordIclickonLOGIN()
    {
        
        pages.OrangeHRM _OrangeHRM = new pages.OrangeHRM(driver);
    TestModellerLogger.SetLastNodeGuid("be9b2c06-ed2d-4f2c-b3dc-fb85bbbffd7e");
    _OrangeHRM.Enter_txtUsername("Admin");

    TestModellerLogger.SetLastNodeGuid("35607aff-476d-432e-ba2a-faba9a60f86d");
    _OrangeHRM.Enter_txtPassword("Admin123");

    TestModellerLogger.SetLastNodeGuid("dabc2eb1-7cad-46b7-9706-30843f70e722");
    _OrangeHRM.Click_LOGIN();

    }


    @Test  (groups= {"Orange","Orange - Default Profile"})
    @TestModellerPath(guid = "5286d7e2-ec3e-4b00-b823-60f909b1363c")
    public void GoToUrlIentertxtUsername1inthetxtUsernameIentertxtPassword2inthetxtPasswordIclickonLOGIN1()
    {
        
        pages.OrangeHRM _OrangeHRM = new pages.OrangeHRM(driver);
    TestModellerLogger.SetLastNodeGuid("be9b2c06-ed2d-4f2c-b3dc-fb85bbbffd7e");
    _OrangeHRM.Enter_txtUsername("Admin");

    TestModellerLogger.SetLastNodeGuid("d6a90aaf-c056-4110-953c-d7285c3ddf71");
    _OrangeHRM.Enter_txtPassword("#!_ @");

    TestModellerLogger.SetLastNodeGuid("dabc2eb1-7cad-46b7-9706-30843f70e722");
    _OrangeHRM.Click_LOGIN();

    }


    @Test  (groups= {"Orange","Orange - Default Profile"})
    @TestModellerPath(guid = "05aca735-22b4-4add-9cf3-c43b79599243")
    public void GoToUrlIentertxtUsername1inthetxtUsernameIentertxtPassword2inthetxtPasswordIclickonLOGIN2()
    {
        
        pages.OrangeHRM _OrangeHRM = new pages.OrangeHRM(driver);
    TestModellerLogger.SetLastNodeGuid("529f0f53-5a42-4efe-ba64-3f46f90940ce");
    _OrangeHRM.Enter_txtUsername("#!_ @");

    TestModellerLogger.SetLastNodeGuid("35607aff-476d-432e-ba2a-faba9a60f86d");
    _OrangeHRM.Enter_txtPassword("Admin123");

    TestModellerLogger.SetLastNodeGuid("dabc2eb1-7cad-46b7-9706-30843f70e722");
    _OrangeHRM.Click_LOGIN();

    }


}