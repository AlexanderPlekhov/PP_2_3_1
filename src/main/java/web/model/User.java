package web.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Component
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false, unique=true)
    private Long id;

    @Column(name = "name")
    @NotEmpty(message = "Поле \"Name\" не может быть пустым")
    @Size(min=2, message = "\"Name\" должно состоять не менее, чем из двух букв")
    private String name;

    @Column(name = "last_name")
    @NotEmpty(message = "Поле \"Last Name\" не может быть пустым")
    @Size(min=2, message = "\"Last Name\" должно состоять не менее, чем из двух букв")
    private String lastName;

    @Column(name = "age")
    @Min(value = 1, message = "Возраст должен быть больше 0")
    private byte age;

    @Column(name = "email")
    @NotEmpty(message = "Поле \"E-mail\" обязательно для заполнения")
    @Size(min=8, message = "Поле \"E-mail\" должно состоять не менее, чем из 8 знаков")
    private String email;

    public User() {};
    public User(String name, String lastName, byte age, String email) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public long getId() {return id;}
    public void setId(long id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    public byte getAge() {return age;}
    public void setAge(byte age) {this.age = age;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
}
