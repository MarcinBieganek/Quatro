package command;

import other.ComparatorFactory;
import shapes.ShapeRepository;

class Sort implements  Command{
    private ShapeRepository shapeRepo;
    private String[] args;
    private final ComparatorFactory comparatorFactory=new ComparatorFactory();
    public Sort(String[] args, ShapeRepository shapeRepo) {
        this.shapeRepo = shapeRepo;
        this.args = args;
    }

    @Override
    public void run() {
        try {
            shapeRepo.sort(comparatorFactory.getComparator(ComparatorFactory.CompareBy.valueOf(args[1]), ComparatorFactory.OrderBy.valueOf(args[2])));
        }
        catch (Exception e){
            System.out.println("Wrong sort arguments");
        }
    }
}
