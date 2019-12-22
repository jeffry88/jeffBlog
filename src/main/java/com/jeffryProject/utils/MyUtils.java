package com.jeffryProject.utils;

import org.springframework.util.DigestUtils;

import javax.servlet.http.HttpServletRequest;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

public class MyUtils {
    static String regEx = "[\u4e00-\u9fa5]";
    static Pattern pat = Pattern.compile(regEx);

    /**
     * 获取系统当前时间
     * @return  时间字符串
     */
    public static String getDateTime(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date());
    }
    /**
     * 获取系统当前时间
     * @return  时间字符串
     */
    public static String getDateTimeNum(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
        return sdf.format(new Date());
    }

    /**
     * 加盐加密
     * @param params //密码
     * @param salt //密码
     * @return
     */
    public static String pswSalt(String params, String salt){
        String md5salt = DigestUtils.md5DigestAsHex(salt.getBytes());
        String str = DigestUtils.md5DigestAsHex(params.getBytes());
        String psw = DigestUtils.md5DigestAsHex((str+md5salt).getBytes());
        return psw;
    }

    /**
     * 盐生成方法
     * @param mu//返回盐位数
     * @return
     */
    public static String salt(Integer mu){
        Random random = new Random();
        String chars = "qazwsxedcrfvtgbyhnujmikolp1638074925";
        String salt = "";
        for(int i = 0 ; i < mu ;i ++ ){
            salt += chars.charAt(random.nextInt(chars.length()));
        }
        return salt;
    }

    /**
     * md5加密
     * @param s
     * @return
     */
    public final static String MD5(String s) {
        char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        try {
            byte[] btInput = s.getBytes("UTF-8");
            // 获得MD5摘要算法的 MessageDigest 对象
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            // 使用指定的字节更新摘要
            mdInst.update(btInput);
            // 获得密文
            byte[] md = mdInst.digest();
            // 把密文转换成十六进制的字符串形式
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     * 判断客户端请求是否是火狐浏览器
     * @param req
     * @return boolean
     */
    public static boolean isFirefoxBrowse(HttpServletRequest req) {
        String userAgent = req.getHeader("USER-AGENT");
        if (userAgent.indexOf("Firefox") != -1) {//火狐浏览器
            return true;
        } else {//其他浏览器
            return false;
        }
    }
    /**
     * 根据指定大小切割list
     * @param resList
     * @param count
     * @return
     */
    public static <T> List<List<T>> splitList(List<T> resList, int count) {
        if (resList == null || count < 1)
            return null;
        List<List<T>> ret = new ArrayList<List<T>>();
        int size = resList.size();
        if (size <= count) { // 数据量不足count指定的大小
            ret.add(resList);
        } else {
            int pre = size / count;
            int last = size % count;
            // 前面pre个集合，每个大小都是count个元素
            for (int i = 0; i < pre; i++) {
                List<T> itemList = new ArrayList<T>();
                for (int j = 0; j < count; j++) {
                    itemList.add(resList.get(i * count + j));
                }
                ret.add(itemList);
            }
            // last的进行处理
            if (last > 0) {
                List<T> itemList = new ArrayList<T>();
                for (int i = 0; i < last; i++) {
                    itemList.add(resList.get(pre * count + i));
                }
                ret.add(itemList);
            }
        }
        return ret;

    }
}
