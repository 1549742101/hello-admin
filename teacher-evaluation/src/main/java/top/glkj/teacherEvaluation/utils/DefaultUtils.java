package top.glkj.teacherEvaluation.utils;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author : xgl
 * @version : 0.0.1
 * @date :2020/9/16 11:12
 */
public class DefaultUtils {
    public static String arrayToString(int ...a){
        AtomicReference<StringBuffer> sb = new AtomicReference<>(new StringBuffer());
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
        int[] arr = new int[list.size()];
        return arrayToString();
    }
}
