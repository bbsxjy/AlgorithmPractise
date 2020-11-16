package Dp.LC5;

import java.util.List;
import Utils.Models.TestCaseModel;
import Utils.TestDataProvider;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LongestPalindromicSubstringTest {

    private LongestPalindromicSubstring naiveImpl;
    private LongestPalindromicSubstring dynamicProgrammingImpl;
    private LongestPalindromicSubstring optimalImpl;
    private TestDataProvider testDataProvider;
    private List<TestCaseModel> testCaseModelList;

    @BeforeMethod
    public void setup() {
        naiveImpl = new NaiveImpl();
        dynamicProgrammingImpl = new DynamicProgrammingImpl();
        optimalImpl = new OptimalImpl();
        testDataProvider = new TestDataProvider("DP/LC5/testdata/data.json");
        testCaseModelList = testDataProvider.getDataFromJson();
    }

    @Test
    public void testNaiveImplementation() {
        for(TestCaseModel testCase : testCaseModelList) {
            String res = naiveImpl.longestPalindrome(
                    testCase.getTestcase()
                            .getInput()
                            .getText());
            assertResults(testCase, res);
        }
    }

    @Test
    public void testDpImplementation() {
        for(TestCaseModel testCase : testCaseModelList) {
            String res = dynamicProgrammingImpl.longestPalindrome(
                    testCase.getTestcase()
                            .getInput()
                            .getText());
            assertResults(testCase, res);
        }
    }

    @Test
    public void testOptimalImplementation() {
        for(TestCaseModel testCase : testCaseModelList) {
            String res = optimalImpl.longestPalindrome(
                    testCase.getTestcase()
                            .getInput()
                            .getText());
            assertResults(testCase, res);
        }
    }

    private void assertResults(final TestCaseModel testCase, final String res) {
        Assert.assertTrue(
                testCase.getTestcase()
                        .getOutput()
                        .getArray()
                        .contains(res));
    }
}
