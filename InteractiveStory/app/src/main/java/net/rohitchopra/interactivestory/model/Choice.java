package net.rohitchopra.interactivestory.model;

/**
 * Created by rohitchopra on 2/22/15.
 */
public class Choice {

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    public Choice(String text, int imageId) {
        mText = text;
        mImageId = imageId;
    }

    private String mText;

    private int mImageId;
}
