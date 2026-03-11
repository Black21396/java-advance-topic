package net.fadi.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * A marker annotation for identifying specific types.
 * This annotation can be used to mark classes that have a particular role or
 * behavior in the application.
 * It does not contain any elements and serves as a simple marker.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface MarkerAnnotation {

}
