package Math.LC9;

import java.util.List;

import Utils.Models.TestCaseModel;
import Utils.TestDataProvider;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PalindromeNumberTest {

    private PalindromeNumber naiveImpl;
    private PalindromeNumber optimalImpl;
    private TestDataProvider testDataProvider;
    private List<TestCaseModel> testCaseModelList;

    @BeforeMethod
    public void setup() {
        naiveImpl = new NaiveImpl();
        optimalImpl = new OptimalImpl();
        testDataProvider = new TestDataProvider("Math/LC9/testdata/data.json");
        testCaseModelList = testDataProvider.getDataFromJson();
    }

    @Test
    public void testNaiveImplementation() {
        for(TestCaseModel testCase : testCaseModelList) {
            boolean res = naiveImpl.isPalindrome(
                    testCase.getTestcase()
                            .getInput()
                            .getNumber());
            assertResults(testCase, res);
        }
    }

    @Test
    public void testOptimalImplementation() {
        for(TestCaseModel testCase : testCaseModelList) {
            boolean res = optimalImpl.isPalindrome(
                    testCase.getTestcase()
                            .getInput()
                            .getNumber());
            assertResults(testCase, res);
        }
    }

    private void assertResults(final TestCaseModel testCase, final boolean res) {
        Assert.assertEquals(res,
                testCase.getTestcase()
                        .getOutput()
                        .isBool());
    }
}
