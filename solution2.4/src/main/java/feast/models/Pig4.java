package feast.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//setter + @Autowired
@Component
public class Pig4 {

    private Lamb5 lamb;

    @Autowired
    public void setLamb(Lamb5 lamb) {
        this.lamb = lamb;
    }

    public String toString() {
        return "which is stuffed inside a lamb, " + lamb.toString();
    }
}
