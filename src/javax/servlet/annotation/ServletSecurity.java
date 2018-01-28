package javax.servlet.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ServletSecurity {
    HttpConstraint value() default @HttpConstraint;

    HttpMethodConstraint[] httpMethodConstraints() default {};

    public static enum TransportGuarantee {
        NONE,
        CONFIDENTIAL;

        private TransportGuarantee() {
        }
    }

    public static enum EmptyRoleSemantic {
        PERMIT,
        DENY;

        private EmptyRoleSemantic() {
        }
    }
}