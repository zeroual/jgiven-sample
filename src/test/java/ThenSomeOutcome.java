import com.tngtech.jgiven.Stage;

 //JGiven does not require you to inherit from the Stage class,
 //however, the Stage class already provides some useful methods like and() and self().

public class ThenSomeOutcome extends Stage<ThenSomeOutcome> {
    public ThenSomeOutcome some_outcome() {
        return self();
    }
}
