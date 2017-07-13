package generic;

/**
 * Created by zouxiang on 2017/7/12.
 */
public class GenericUtil {

    public static <T>T getClazz(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        T t = clazz.newInstance();
        return t;
    }

}
