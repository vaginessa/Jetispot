package bruhcollective.itaysonlab.jetispot.core.objs.hub

import com.squareup.moshi.JsonClass
import dev.zacsweers.moshix.sealed.annotations.DefaultObject
import dev.zacsweers.moshix.sealed.annotations.TypeLabel

@JsonClass(generateAdapter = true, generator = "sealed:id")
sealed class HubComponent {
  // HOME

  @TypeLabel("home:shortSectionHeader", alternateLabels = ["home:sectionHeader", "home:encoreSectionHeader"])
  object HomeShortSectionHeader: HubComponent()

  @TypeLabel("home:tappableSectionHeader")
  object HomeLargeSectionHeader: HubComponent()

  @TypeLabel("home:shortcutsContainer")
  object ShortcutsContainer: HubComponent(), ComponentInGrid

  @TypeLabel("home:shortcutsCard")
  object ShortcutsCard: HubComponent()

  @TypeLabel("home:singleFocusCard")
  object SingleFocusCard: HubComponent()

  @TypeLabel("artist:likedSongsRow")
  object ArtistLikedSongs: HubComponent()

  // BROWSE

  @TypeLabel("find:categoryCard")
  object FindCard: HubComponent(), ComponentInGrid

  // GLUE

  @TypeLabel("glue:sectionHeader", alternateLabels = ["glue2:sectionHeader"])
  object GlueSectionHeader: HubComponent()

  @TypeLabel("home:carousel", alternateLabels = ["glue:carousel"])
  object Carousel: HubComponent()

  @TypeLabel("home:cardMedium", alternateLabels = ["glue2:card"])
  object MediumCard: HubComponent(), ComponentInGrid

  @TypeLabel("consumerMobile:albumTrackRow")
  object AlbumTrackRow: HubComponent()

  @TypeLabel("consumerMobile:artistTrackRow")
  object ArtistTrackRow: HubComponent()

  @TypeLabel("artist:pinnedItem")
  object ArtistPinnedItem: HubComponent()

  @TypeLabel("glue:textRow")
  object TextRow: HubComponent()

  @TypeLabel("glue2:imageRow")
  object ImageRow: HubComponent()

  @TypeLabel("freetier:entityTopContainer")
  object AlbumHeader: HubComponent()

  @TypeLabel("header:fullBleed")
  object ArtistHeader: HubComponent()

  @TypeLabel("freetier:largerRow")
  object LargerRow: HubComponent()

  // BUTTONS

  @TypeLabel("freetier:tertiaryButtonOutlined", alternateLabels = ["find:tertiaryButton"])
  object OutlinedButton: HubComponent()

  // SYNTH (components that are generated by the application without any chance to receive from API, "synthetic")

  @TypeLabel("synth:playlistHeader")
  object PlaylistHeader: HubComponent()

  @TypeLabel("synth:playlistHeaderLarge")
  object LargePlaylistHeader: HubComponent()

  @TypeLabel("synth:playlistTrackRow", alternateLabels = ["listeninghistory:trackRow"])
  object PlaylistTrackRow: HubComponent()

  @TypeLabel("synth:collectionHeader")
  object CollectionHeader: HubComponent()

  @TypeLabel("synth:showHeader")
  object ShowHeader: HubComponent()

  @TypeLabel("synth:showTopics")
  object PodcastTopics: HubComponent()

  @TypeLabel("synth:episodeItem")
  object EpisodeListItem: HubComponent()

  // IGNORING

  @TypeLabel("listeninghistory:dividerAfterEntityRow")
  object EmptySpace: HubComponent()

  @TypeLabel("freetier:offlineSwitchComponent", alternateLabels = ["find:header"])
  object Ignored: HubComponent()

  @DefaultObject
  object Unknown: HubComponent()
}

interface ComponentInGrid

fun HubComponent.isGrid() = this is ComponentInGrid