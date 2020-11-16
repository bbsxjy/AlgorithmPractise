package Utils;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import lombok.SneakyThrows;
import lombok.val;

import Utils.Models.TestCaseModel;
import com.google.gson.Gson;
import com.google.gson.JsonParser;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Test data provider class for providing test data by reading/adding data for
 * tests.
 */
public class TestDataProvider {

    private static final String TEST_DATA_ROOT_PATH = System.getProperty("user.dir") + "/Algos/tst/";

    private static final Gson GSON = new Gson();

    private final String filePath;

    public TestDataProvider(String filePath) {
        this.filePath = filePath;
    }

    @SneakyThrows
    public List<TestCaseModel> getDataFromJson() {
        val inputStream = new FileInputStream(TEST_DATA_ROOT_PATH + filePath);
        val fileReader = new InputStreamReader(inputStream, UTF_8);
        val jsonData = new JsonParser().parse(fileReader);
        val jsonArray = jsonData.getAsJsonArray();
        List<TestCaseModel> testCaseModelList = new ArrayList<>();

        for(val jsonObj: jsonArray) {
            testCaseModelList.add(GSON.fromJson(jsonObj, TestCaseModel.class));
        }

        return testCaseModelList;
    }

}
