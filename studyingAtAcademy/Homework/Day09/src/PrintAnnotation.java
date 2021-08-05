import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD}) //어노테이션이 적용할 대상 열거상수(ElementType)를 메서드로 한다.
@Retention(RetentionPolicy.RUNTIME) //어노테이션 유지 정책을 런타임시까지 한다.
/*	유지 정책이란 어노테이션 사용용도에 따라 어느 범위까지 유지할 것인지 지정하는 것을 말한다.
 *  소스상에서만 유지할 건지, 컴파일된 클래스까지 유지할 건지,런타임 시에도 유지할 것인지를 지정해야 한다.
 *  여기서는 런타임시 까지 유지한다.
 *  
 *  런타임 유지 정책은 바이트 코드 파일까지 어노테이션 정보를 유지하면서 리플렉션을 이용해서 런타임시에도 어노
 *  테이션 정보를 얻을 수 있다.
 *  리플렉션이란 런타임시에 클래스 메타 정보를 얻는 기능을 말한다. 예를 들어 클래스가 가지고 있는 필드가 무엇인지, 
 *  어떤 생성자를 갖고 있는지, 어떤 메서드를 가지고 있는지, 적용된 어노테이션이 무엇인지 알아내는 것을 말한다.
 * 
 */
public @interface PrintAnnotation { //@interface로 어노테이션 이름 PrintAnnotaion 정의
	String value() default "-"; //엘리먼트 타입 엘리먼트이름() 선언, 기본값을 "-"지정, 구분선에 
	//사용할 문자
	int number() default 15; //15는 문자 반복횟수
}
