package com.company.Creational.SimpleFactory;

import java.time.LocalDate;

public class NewsPost extends Post{

    private String title;

    private LocalDate newsTime;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(LocalDate newsTime) {
        this.newsTime = newsTime;
    }
}
