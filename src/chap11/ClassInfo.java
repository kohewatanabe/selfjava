package chap11;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented//javadocにアノテーション情報を反映する宣言。
@Retention(RetentionPolicy.RUNTIME)//アノテーション情報をどのタイミングからどのタイミングまで保持するか。
@Target(ElementType.TYPE)//アノテーションを付与する対象の宣言。
public @ interface ClassInfo {
    String value() default "";//属性と属性の初期値
    String version() default "";
    String description() default "";
}