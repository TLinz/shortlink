package org.linzzxz.shortlink.admin.toolkit;

import java.security.SecureRandom;

/**
 * 分组ID随机生成器
 */
public final class RandomGenerator {

    private static final String CHARACTERS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final SecureRandom RANDOM = new SecureRandom();

    public static String generateRandomString() {
        return generateRandomString(6);
    }

    /**
     * 生成随机分组ID
     *
     * @param length 生成位数
     * @return 分组ID
     */
    public static String generateRandomString(int length) {
        StringBuilder randomString = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int randomIndex = RANDOM.nextInt(CHARACTERS.length());
            randomString.append(CHARACTERS.charAt(randomIndex));
        }

        return randomString.toString();
    }

    public static void main(String[] args) {
        // 生成包含数字和字母的6位随机数示例
        String randomValue = generateRandomString(6);
        System.out.println("Random Value: " + randomValue);
    }
}
