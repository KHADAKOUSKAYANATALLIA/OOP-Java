package HomeWork04.view;

import HomeWork04.model.User;
import java.util.List;

// Интерфейс работает для всех классов, которые наследуются от Юзер
public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}