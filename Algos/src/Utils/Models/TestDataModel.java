package Utils.Models;

import lombok.Getter;
import lombok.Setter;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Getter
@Setter
public class TestDataModel {
    @SerializedName("text")
    @Expose
    private String text;

    @SerializedName("number")
    @Expose
    private int number;

    @SerializedName("boolean")
    @Expose
    private boolean bool;

    @SerializedName("array")
    @Expose
    private List<Object> array;

    @SerializedName("map")
    @Expose
    private Map<Object, Object> map;

    @SerializedName("set")
    @Expose
    private Set<Object> set;
}
