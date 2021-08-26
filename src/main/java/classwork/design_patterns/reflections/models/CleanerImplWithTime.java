package classwork.design_patterns.reflections.models;

import classwork.design_patterns.reflections.ObjectFactory;

public class CleanerImplWithTime extends CleanerImpl {
    private Cleaner cleaner = ObjectFactory.getInstance().createObject(CleanerImpl.class);

    @Override
    public void clean() {
//        Cleaner cleaner = ObjectFactory.getInstance().createObject(CleanerImpl.class);
        long start = System.nanoTime();
        cleaner.clean();
//        super.clean();
        System.out.println(System.nanoTime() - start);
    }
}
