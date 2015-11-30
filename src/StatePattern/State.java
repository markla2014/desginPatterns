package StatePattern;
/*
 *  把特定的状态行为放入一个对象中，由于所有的相关代码都在某个state 中可以通过相关的子类很容易的增加显得
 *  新的状态和转换
 *  消除乐大量的分支预计
 *  当一个对象行为取决于它的状态，并且他必须运行时刻根据转台改变它的行为的时候使用状态模式
 */
public abstract class State {
 public abstract void WriteProgram(Work k);
}
