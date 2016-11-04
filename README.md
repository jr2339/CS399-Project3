# CS399-Project3
## iBuy. 
A household goes through tons of "consumables": food, toilet paper, laundry detergent, you name it. It is a huge challenge for households to track and manage these daily needs. Though various household members are moving around the city all day --- and could potentially make efficient on-the-way purchases --- in reality, no one knows or can remember what needs to be purchased and who is supposed to purchase it. Which means wasted time, extra trips to the store for one item, and general frustration about eating dry cereal, washing your hair with facial soap, and wiping your bottom with paper towels. We've all been there. Or worse yet, multiple people remember to buy and you end up with 400 rolls of toilet paper. iBuy will solve this problem forever.


Provide basic iBuy functionality for personal use. General kinds of things a basic system might support:
[x]	entering items to be purchased (incl. possibly priority, quantity, urgency, estimated cost)
[x]	viewing items to be purchased
[x]	somehow checking off/removing items
[x]	allow entry/sorting of buying list by date, urgency, estimated cost)
[ ] Reasonable quality UI --- clean, aesthetic, smooth function across implemented devices. Serious points here.
[x] Basic Test Harness. The basic version doesn't network its state dynamically, just saves app state locally when you exit..

[ ]	Neat ways to speed item entry, e.g., "most common items"
[ ] spelling completion based on past history. It's a pain to search out "milk" out of a huge list all the time! Recognize that we buy some things far more than others...how can your GUI help here?
[ ]	Multiple users in a household/purchasing group:
[ ]	Add/delete users from the purchasing group.
[ ]	Assignment of responsibility for purchase to someone
[ ]	Records who actually made the purchase.
[ ]	Support different categories of purchases (e.g. household, car, etc.)
[ ]	User-extensible purchase categories.
[ ]	Some mechanism for sending nagging texts/messages to the user
[ ]	Tracks amount and category of purchases. Good to see where your money went last month.
[ ] Reporting: able to view purchases for each person in some time period. Basis for household accounting, i.e., each inhabitant's total outlays.

### Extra Credit

[ ]	GPS-based reminders: sends an extra reminder when the user is within a mile (or whatever) of some shopping place. You would simulate the GPS functionality for testing, e.g., you'd have a separate "test control panel" showing on a workstation in your testing area, which shows, say, a map of Flagstaff, or even just buttons with "Mall" "Milton Road" and a couple of other major "areas" on it. The user would click one to "go there"...and the Android application would be notified somehow and respond appropriately.
[ ]	Multiple purchasing groups: the user can be a part of multiple purchasing groups, see/analyze purchases for each.
[ ]	Advanced analysis: pie graphs of expenses by category.
[ ]	Advanced analysis: a way to display who's been slacking, i.e., for each person, how much of the time that purchases were assigned to them, they actually made the assigned purchase --- and how on-time.
[ ]	Advanced back-end functionality of any sort --- the more like a real product, the better.
