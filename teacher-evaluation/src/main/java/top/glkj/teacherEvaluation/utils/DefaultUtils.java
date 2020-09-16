package top.glkj.teacherEvaluation.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author : xgl
 * @version : 0.0.1
 * @date :2020/9/16 11:12
 */
public class DefaultUtils {
    private static AtomicReference<StringBuffer> sb = new AtomicReference<>(new StringBuffer());
    public static String arrayToString(int ...a){
        for (int j : a) {
            sb.get().append(j);
            sb.get().append(",");
        }
        sb.get().delete(sb.get().length()-1, sb.get().length());
        return sb.toString();
    }
    public static int[] stringToArray(String s){
        String[] split = s.split(",");
        int [] result = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            result[i] = Integer.parseInt(split[i]);
        }
        return result;
    }
    public static String listToString(List<Integer> list){
        for (int j : list) {
            sb.get().append(j);
            sb.get().append(",");
        }
        sb.get().delete(sb.get().length()-1, sb.get().length());
        return arrayToString();
    }
    public static List<Integer> stringToList(String s){
        String[] split = s.split(",");
        List<Integer> result = new ArrayList<>();
        for (String value : split) {
            result.add(Integer.parseInt(value));
        }
        return result;
    }
}
