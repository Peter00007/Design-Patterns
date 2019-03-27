package com.patterns.behavioral.visitor;


public class HomeWork implements HomeWorkElement{
    HomeWorkElement[] homeWorkElements;

    public HomeWork() {
        this.homeWorkElements = new HomeWorkElement[] {
                new UkrainianLanguage(),
                new ForeignLanguage(),
                new Maths()
        };
    }

    @Override
    public void beStudying(Guy guy) {
        for (HomeWorkElement homeWorkElement: homeWorkElements) {
            homeWorkElement.beStudying(guy);
        }
    }
}
