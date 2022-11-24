package j13_Object;

import lombok.*;

import java.util.Objects;

@NoArgsConstructor // 기본생성자
@AllArgsConstructor // 모든 변수들을 arguments로 받겠다 (전체 생성자)
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data
public class Entity {

    private String name;
    private int age;
    private Object address;

    public boolean cmp(Object obj) {
        return this.getClass() == Entity.class;
    }


}
