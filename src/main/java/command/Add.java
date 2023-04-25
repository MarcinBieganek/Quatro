package command;

import other.InputHandler;
import shapes.Shape;
import shapes.ShapeRepository;

import java.util.Arrays;

class Add implements Command {
    private final ShapeRepository shapeRepo;
    private final String[] args;

    private final InputHandler inputHandler;

    public Add(String[] args, ShapeRepository shapeRepo, InputHandler inputHandler) {
        this.shapeRepo = shapeRepo;
        this.args = args;
        this.inputHandler = inputHandler;
    }

    @Override
    public void run() {
        try {
            Shape shape = inputHandler.createFigureWithArguments(args);
            System.out.println(shape.toString());
            shapeRepo.addShape(shape);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
