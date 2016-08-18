package hello;

import org.springframework.stereotype.Component;

/**
 * Created by codygulley on 8/17/16.
 */


@Component
public class StringTransform {
    private String transformedString;
    public String reverseString(String originalString){
        StringBuilder reversedString = new StringBuilder(originalString).reverse();
        this.transformedString = reversedString.toString();
        return transformedString;
    }
    public String toUppercase(String originalString){
        this.transformedString = originalString.toUpperCase();
        return transformedString;
    }
    public String toLowercase(String originalString){
        this.transformedString = originalString.toLowerCase();
        return transformedString;
    }
}
