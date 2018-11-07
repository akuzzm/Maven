package address;

import com.academy.automationpractice.ddt.framework.model.AddressData;

public class ParseAddress {
    public static void main(String[] args) {
        String rawLine = "Kolya,Ivanov,Petrovskogo st. 35,Kharkov,Alaska,61033,United States,+3809353613437,093234567,addressAddedRef";
        AddressData address = parseAddress(rawLine);
        System.out.println(address);

    }

    public static AddressData parseAddress(String rawLine){
        String [] text = rawLine.split(",");
        AddressData address = new AddressData()
                .withFirstName(text[0])
                .withLastName(text[1])
                .withAddress(text[2])
                .withCity(text[3])
                .withState(text[4])
                .withZipCode(text[5])
                .withCountry(text[6])
                .withMobilePhone(text[7])
                .withHomePhone(text[8])
                .withAddressAlias(text[9]);
        return address;

    }
}
