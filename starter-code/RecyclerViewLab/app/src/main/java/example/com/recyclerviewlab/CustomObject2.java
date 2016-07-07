package example.com.recyclerviewlab;

/**
 * Created by jamesrondina on 7/5/16.
 */
public class CustomObject2 {
    String titleText;
    String descriptionText;
    String colorText;
    boolean checked;

    public CustomObject2() {
        titleText = "Title";
        descriptionText = "Description";
        colorText = "@android:color/holo_green_dark";
        checked = false;
    }

    public CustomObject2(String title, String description, String color, boolean checked){
        titleText = title;
        descriptionText = description;
        colorText = color;
        checked = checked;

    }

    public String getTitleText() {
        return titleText;
    }

    public void setTitleText(String titleText) {
        this.titleText = titleText;
    }

    public String getDescriptionText() {
        return descriptionText;
    }

    public void setDescriptionText(String descriptionText) {
        this.descriptionText = descriptionText;
    }

    public String getColorText() {
        return colorText;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public void setColorText(String colorText) {
        this.colorText = colorText;

    }
}
