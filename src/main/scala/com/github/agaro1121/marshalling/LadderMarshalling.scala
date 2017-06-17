package com.github.agaro1121.marshalling

import io.circe.{Decoder, Encoder}
import io.circe.generic.semiauto.{deriveDecoder, deriveEncoder}
import com.github.agaro1121.models.ladder.{Account, Challenges, Entries, Ladder, Twitch, Character}

trait LadderMarshalling {
  implicit protected lazy val CharacterDecoder: Decoder[Character] = deriveDecoder[Character]
  implicit protected lazy val CharacterEncoder: Encoder[Character] = deriveEncoder[Character]

  implicit protected lazy val ChallengesDecoder: Decoder[Challenges] = deriveDecoder[Challenges]
  implicit protected lazy val ChallengesEncoder: Encoder[Challenges] = deriveEncoder[Challenges]

  implicit protected lazy val TwitchDecoder: Decoder[Twitch] = deriveDecoder[Twitch]
  implicit protected lazy val TwitchEncoder: Encoder[Twitch] = deriveEncoder[Twitch]

  implicit protected lazy val AccountDecoder: Decoder[Account] = deriveDecoder[Account]
  implicit protected lazy val AccountEncoder: Encoder[Account] = deriveEncoder[Account]

  implicit protected lazy val EntriesDecoder: Decoder[Entries] = deriveDecoder[Entries]
  implicit protected lazy val EntriesEncoder: Encoder[Entries] = deriveEncoder[Entries]

  implicit protected lazy val LadderDecoder: Decoder[Ladder] = deriveDecoder[Ladder]
  implicit protected lazy val LadderEncoder: Encoder[Ladder] = deriveEncoder[Ladder]


}
