package example.com.recyclerviewlab;

/**
 * Created by jamesrondina on 7/5/16.
 */
public class CustomObject {
    String titleText;
    String descriptionText;
    String colorText;

    public CustomObject() {
        titleText = "Title";
        descriptionText = "Description";
        colorText = "Color";
    }

    public CustomObject(String title, String description, String color){
        titleText = title;
        descriptionText = description;
        colorText = color;

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

    public void setColorText(String colorText) {
        this.colorText = colorText;
    }
}
