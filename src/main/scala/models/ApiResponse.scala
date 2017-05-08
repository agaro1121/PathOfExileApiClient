package models

case class ApiResponse(
  next_change_id: String,
  stashes: List[Stash]
)
