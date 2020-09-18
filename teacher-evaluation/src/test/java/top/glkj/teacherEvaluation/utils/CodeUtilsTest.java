package top.glkj.teacherEvaluation.utils;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import static org.junit.Assert.*;

/**
 * @author : xgl
 * @version : 0.0.1
 * @date :2020/9/17 9:09
 */
public class CodeUtilsTest {
    @Test
    public void test() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String s = CodeUtils.getEncryptedPwd("123456");
        System.out.println(s);
        System.out.println(CodeUtils.validPassword("123456",s));

    }
}