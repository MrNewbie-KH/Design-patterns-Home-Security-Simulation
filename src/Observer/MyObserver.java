package Observer;

import lombok.Data;


@Data
public class MyObserver {
    private String name;
    public MyObserver(String name) {
        this.name = name;
    }
}
