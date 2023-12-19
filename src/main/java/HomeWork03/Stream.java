package HomeWork03;

import java.util.ArrayList;
import java.util.List;

public class Stream extends Group implements Iterable<Student> {
    private int streamNum;
    private List<Group> groups;

    /**
     * Создание объекта класса Stream
     *
     * @param streamNum номер потока
     */
    public Stream(int streamNum) {
        this.streamNum = streamNum;
        this.groups = new ArrayList<>();
    }

    /**
     * Добавление группы студентов в поток
     *
     * @param group группа студентов для добавления
     */
    public void addGroup(Group group) {
        this.groups.add(group);
    }

    /**
     * Удаление группы из потока
     *
     * @param studyGroup объект класса группа для удаления
     */
    public void removeGroup(Group studyGroup) {
        groups.remove(studyGroup);

    }

    /**
     * Получение номера потока
     *
     * @return номер потока групп
     */
    public int getStreamNum() {
        return streamNum;
    }

    /**
     * Получение списка групп в потоке
     *
     * @return список групп
     */
    public List<Group> getGroups() {
        return groups;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Поток ").append(streamNum).append(" состоит из ").append(groups.size()).append(" групп(ы):").append("\n");
        for (Group group : groups) {
            result.append("Группа ").append(group.getGroupNumber()).append(" состоит из ").append(group.getStudentList().size()).append(" человек").append("\n");
        }
        return result.toString();
    }
}
