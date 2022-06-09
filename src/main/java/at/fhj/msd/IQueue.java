package at.fhj.msd;

// fastly written (not really nice) comments but good enough to understand
public interface IQueue {
  /* 
  add object to queue, return true if works, otherwise false
  */
  boolean offer(Object obj);

  /* 
  returns and deletes first element; null if no element in there
   */
  Object poll();

  /* 
  like poll but if no element exists NoSuchElementException is throw in instead of null return value
   */
  Object remove();

  /* 
  gives first element but does not delete, null if nothing there
   */
  Object peek();

  /*
  like peek but NoSuchElementException instead of null
   */
  Object element();
}