package br.com.alura.screenmatch.models;

public class Serie extends Title{
    private int seasons;
    private boolean watching;
    private int chapterPerSeason;
    private int minutePerChapter;

    @Override
    public int getMovieInMinutes() {
        return seasons * chapterPerSeason * minutePerChapter;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isWatching() {
        return watching;
    }

    public void setWatching(boolean watching) {
        this.watching = watching;
    }

    public int getChapterPerSeason() {
        return chapterPerSeason;
    }

    public void setChapterPerSeason(int chapterPerSeason) {
        this.chapterPerSeason = chapterPerSeason;
    }

    public int getMinutePerChapter() {
        return minutePerChapter;
    }

    public void setMinutePerChapter(int minutePerChapter) {
        this.minutePerChapter = minutePerChapter;
    }




}
