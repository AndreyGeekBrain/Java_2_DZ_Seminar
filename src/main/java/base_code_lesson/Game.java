package base_code_lesson;

public interface Game {
    void start(Integer sizeWord, Integer maxTry);
    Answer inputValue(String value);
    GameStatus getGameStatus();
}
