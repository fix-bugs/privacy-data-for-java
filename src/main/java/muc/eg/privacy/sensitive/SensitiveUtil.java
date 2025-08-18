package muc.eg.privacy.sensitive;

/**
 * 脱敏工具类
 */
public class SensitiveUtil {

    private SensitiveUtil() {}

    /**
     * 默认通用正则
     * 保留首尾字符，中间替换成 *
     */
    public static final String DEFAULT_REGEX = "(?<=.).*(?=.)";
    /**
     * 默认手机号脱敏正则
     * 保留前三位和后四位，中间替换成****
     */
    public static final String DEFAULT_MOBILE_REGEX = "(\\d{3})\\d{4}(\\d{4})";
    /**
     * 默认邮箱脱敏正则
     * 保留前三位和@符号后面的部分，中间替换成****
     */
    public static final String DEFAULT_EMAIL_REGEX = "(^[^@]{3})[^@]*(@.*$)";

    /**
     * 默认身份证号脱敏正则
     * 保留前六位和后四位，中间替换成****
     */
    public static final String DEFAULT_ID_CARD_REGEX = "(\\d{6})\\d{8}(\\d{4})";
    /**
     * 默认通用替换字符
     */
    public static final String DEFAULT_REPLACEMENT = "*";
    /**
     * 默认脱敏替换字符
     * 保留前后，中间替换成*****
     */
    public static final String DEFAULT_REPLACEMENT2 = "$1****$2";
    /**
     * 默认脱敏后缀
     */
    public static final String DEFAULT_SUFFIX = "**";


    /**
     * 通用脱敏，保留前后字符，中间替换成 *
     *  e.g. 1234567890 -> 1**0
     * @param source
     * @return
     */
    public static String replace(String source) {
        if (!isBlank(source)) {
            if (source.length() <= 2) {
                return source.charAt(0) + DEFAULT_SUFFIX;
            }
        }
        return replace(source, DEFAULT_REGEX, DEFAULT_REPLACEMENT);
    }

    /**
     * 手机号脱敏，保留前三位和后四位，中间替换成****
     *  e.g. 18000000001 -> 180****0001
     * @param mobile
     * @return
     */
    public static String replaceMobile(String mobile) {
        return replace(mobile, DEFAULT_MOBILE_REGEX, DEFAULT_REPLACEMENT2);
    }

    /**
     * 邮箱脱敏，保留前三位和@符号后面的部分，中间替换成****
     *  e.g. 12122sdjlsd@example.com -> 121****@example.com
     * @param email
     * @return
     */
    public static String replaceEmail(String email) {
        return replace(email, DEFAULT_EMAIL_REGEX, DEFAULT_REPLACEMENT2);
    }

    /**
     * 身份证号脱敏，保留前六位和后四位，中间替换成****
     *  e.g. 110101199003072316 -> 110101****072316
     * @param idCard
     * @return
     */
    public static String replaceIdCard(String idCard) {
        return replace(idCard, DEFAULT_ID_CARD_REGEX, DEFAULT_REPLACEMENT2);
    }

    /**
     * 正则替换
     * @param source 原始字符串
     * @param regex 正则表达式
     * @param replacement 替换字符串
     * @return
     */
    public static String replace(String source, String regex, String replacement) {
        if (isBlank(source) || isBlank(regex) || isBlank(replacement)) {
            return source;
        }
        return source.replaceAll(regex, replacement);
    }

    /**
     * 空字符串校验
     * @param source
     * @return
     */
    public static boolean isBlank(String source) {
        return source == null || source.trim().isEmpty();
    }
}