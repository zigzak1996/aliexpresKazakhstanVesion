package kz.sdu.register.config;


import kz.greetgo.conf.hot.DefaultStrValue;
import kz.greetgo.conf.hot.Description;

@Description("Параметры доступа к БД (используется только БД Postgresql)")
public interface DbConfig {

  @Description("URL доступа к БД")
  @DefaultStrValue("jdbc:postgresql://localhost:5435/test")
  String url();

  @Description("Пользователь для доступа к БД")
  @DefaultStrValue("test")
  String username();

  @Description("Пароль для доступа к БД")
  @DefaultStrValue("asd")
  String password();

  @DefaultStrValue("anzip96@gmail.com")
  @Description("Логин Аккаунта")
  String loginAccount();


  @DefaultStrValue("zaraza123")
  @Description("Пароль Аккаунта")
  String accountPassword();
}
