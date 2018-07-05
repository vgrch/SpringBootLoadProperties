package az.lsim.ConfigurationProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app.value",ignoreUnknownFields = true,ignoreInvalidFields = true)
public class Config {

    private static String annotation;

    private static String[] myarray;

    private static boolean logical;

    private static int numericint = -1;        // default value

    private static int numericintarray;

    private static int numericlong;

    private static double numericdouble;

    public static String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        Config.annotation = annotation;
    }

    public static String[] getMyarray() {
        return myarray;
    }

    public  void setMyarray(String[] myarray) {
        Config.myarray = myarray;
    }

    public static boolean isLogical() {
        return logical;
    }

    public void setLogical(boolean logical) {
        Config.logical = logical;
    }

    public static int getNumericint() {
        return numericint;
    }

    public void setNumericint(int numericint) {
        Config.numericint = numericint;
    }

    public static int getNumericlong() {
        return numericlong;
    }

    public void setNumericlong(int numericlong) {
        Config.numericlong = numericlong;
    }

    public static double getNumericdouble() {
        return numericdouble;
    }

    public void setNumericdouble(double numericdouble) {
        Config.numericdouble = numericdouble;
    }

    public static int getNumericintarray() {
        return numericintarray;
    }

    public void setNumericintarray(int numericintarray) {
        Config.numericintarray = numericintarray;
    }
}
