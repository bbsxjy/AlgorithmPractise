package Utils.Models;

import lombok.Getter;
import lombok.Setter;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Getter
@Setter
public class TestCaseModel {
    @SerializedName("testcase")
    @Expose
    private TestIOModel testcase;
}
