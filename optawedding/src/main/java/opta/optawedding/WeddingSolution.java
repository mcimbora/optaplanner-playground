package opta.optawedding;

import org.optaplanner.core.impl.domain.solution.AbstractSolution;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.optaplanner.core.api.domain.solution.PlanningSolution
public class WeddingSolution extends AbstractSolution<HardSoftScore> implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Guest list")
   private java.util.List<opta.optawedding.Guest> guestList;
   @org.kie.api.definition.type.Label(value = "Table list")
   private java.util.List<opta.optawedding.Table> tableList;
   @org.kie.api.definition.type.Label(value = "Seat list")
   @org.optaplanner.core.api.domain.valuerange.ValueRangeProvider(id = "seatRange")
   private java.util.List<opta.optawedding.Seat> seatList;
   @org.kie.api.definition.type.Label(value = "Guest assignment list")
   @org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty
   private java.util.List<opta.optawedding.GuestAssignment> guestAssignmentList;

   public WeddingSolution()
   {
   }

   public java.util.List<opta.optawedding.Guest> getGuestList()
   {
      return this.guestList;
   }

   public void setGuestList(java.util.List<opta.optawedding.Guest> guestList)
   {
      this.guestList = guestList;
   }

   public java.util.List<opta.optawedding.Table> getTableList()
   {
      return this.tableList;
   }

   public void setTableList(java.util.List<opta.optawedding.Table> tableList)
   {
      this.tableList = tableList;
   }

   public java.util.List<opta.optawedding.Seat> getSeatList()
   {
      return this.seatList;
   }

   public void setSeatList(java.util.List<opta.optawedding.Seat> seatList)
   {
      this.seatList = seatList;
   }

   public java.util.List<opta.optawedding.GuestAssignment> getGuestAssignmentList()
   {
      return this.guestAssignmentList;
   }

   public void setGuestAssignmentList(
         java.util.List<opta.optawedding.GuestAssignment> guestAssignmentList)
   {
      this.guestAssignmentList = guestAssignmentList;
   }

   public WeddingSolution(java.util.List<opta.optawedding.Guest> guestList,
         java.util.List<opta.optawedding.Table> tableList,
         java.util.List<opta.optawedding.Seat> seatList,
         java.util.List<opta.optawedding.GuestAssignment> guestAssignmentList)
   {
      this.guestList = guestList;
      this.tableList = tableList;
      this.seatList = seatList;
      this.guestAssignmentList = guestAssignmentList;
   }

}