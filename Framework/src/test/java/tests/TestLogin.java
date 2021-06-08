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

//https://herokuapp.cloud.testinsights.io/app/#!/model-engine/guid/c0fdf641-4c0e-4b60-8f02-73c75b864171
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 67, profileId = 100059)
public class TestLogin extends TestBase
{
    

    
    @Test  (groups= {"Login333","TestLogin"})
    @TestModellerPath(guid = "14307598-3e6c-46cb-998a-9b4cac28a14f")
    public void GoToUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginAuth()
    {
        
        pages.TestFinal _TestFinal = new pages.TestFinal(driver);
    TestModellerLogger.SetLastNodeGuid("02084122-f4ad-4caa-a6ce-6826798d5144");
    _TestFinal.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("e23fb346-049f-433b-91b7-d00c9e5dbcbb");
    _TestFinal.Enter_Username("Chase.Dietrich");

    TestModellerLogger.SetLastNodeGuid("9d35ad69-4cc7-4eef-a6b9-da2477c5833e");
    _TestFinal.Enter_Password("9Mcw5nWcuz");

    TestModellerLogger.SetLastNodeGuid("0b537f0a-a219-4d2b-b7a2-356d589414ff");
    _TestFinal.Click__Login();

    }


    @Test  (groups= {"Login333","TestLogin"})
    @TestModellerPath(guid = "312edcb2-1df8-46e8-87d3-4cc5574af6ef")
    public void GoToUrlPositiveEnterUsernameNegativeEnterPasswordClickLoginError()
    {
        
        pages.TestFinal _TestFinal = new pages.TestFinal(driver);
    TestModellerLogger.SetLastNodeGuid("02084122-f4ad-4caa-a6ce-6826798d5144");
    _TestFinal.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("e23fb346-049f-433b-91b7-d00c9e5dbcbb");
    _TestFinal.Enter_Username("Sincere48");

    TestModellerLogger.SetLastNodeGuid("6dc5abc7-68ad-4727-9c93-aee26d072b3b");
    _TestFinal.Enter_Password("#!_ @");

    TestModellerLogger.SetLastNodeGuid("0cb40e53-ffed-484b-9274-6193ea3941b3");
    _TestFinal.Click__Login();

    }


    @Test  (groups= {"Login333","TestLogin"})
    @TestModellerPath(guid = "361aeff0-a8ec-4c81-adb1-8c78c9a5d2b7")
    public void GoToUrlNegativeEnterUsernamePositiveEnterPasswordClickLoginError()
    {
        
        pages.TestFinal _TestFinal = new pages.TestFinal(driver);
    TestModellerLogger.SetLastNodeGuid("02084122-f4ad-4caa-a6ce-6826798d5144");
    _TestFinal.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("081ff0c9-d654-4891-9b43-75bd228cbfd3");
    _TestFinal.Enter_Username("#!_ @");

    TestModellerLogger.SetLastNodeGuid("6ae77af8-ee98-470f-9ef9-fb552612fe44");
    _TestFinal.Enter_Password("dBlhfiednv");

    TestModellerLogger.SetLastNodeGuid("66e2111e-ac11-4a5c-8ac6-356113436fe9");
    _TestFinal.Click__Login();

    }


    @Test  (groups= {"Login333","TestLogin"})
    @TestModellerPath(guid = "fa1f28bd-44d5-4957-b40f-13018c83b2d3")
    public void GoToUrlNegativeEnterUsernameNegativeEnterPasswordClickLoginError()
    {
        
        pages.TestFinal _TestFinal = new pages.TestFinal(driver);
    TestModellerLogger.SetLastNodeGuid("02084122-f4ad-4caa-a6ce-6826798d5144");
    _TestFinal.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("081ff0c9-d654-4891-9b43-75bd228cbfd3");
    _TestFinal.Enter_Username("#!_ @");

    TestModellerLogger.SetLastNodeGuid("3efbf8b0-f7a6-4ec6-8da5-72eabd9a7e5b");
    _TestFinal.Enter_Password("#!_ @");

    TestModellerLogger.SetLastNodeGuid("28c32dc2-3be9-49e4-ac39-c5b0956ff8df");
    _TestFinal.Click__Login();

    }


}