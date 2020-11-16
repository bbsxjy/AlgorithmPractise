package Utils.Models;

import lombok.Getter;
import lombok.Setter;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Getter
@Setter
public class TestIOModel {
    @SerializedName("input")
    @Expose
    private TestDataModel input;

    @SerializedName("output")
    @Expose
    private TestDataModel output;
}
