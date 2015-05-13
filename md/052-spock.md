## Spock Testing Framework

```
import spock.lang.Specification

class AccountSpec extends Specification {

    def "crediting empty account results in correct balance"() {

        given: "an empty bank account"
        def account = new Account(balance: 0)

        when: "the account is credited $10"
        account << 10.dollars

        then: "the account's balance is $10"
        account.balance == 10.dollars
    }
}
```
